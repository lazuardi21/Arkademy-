import java.util.Scanner;

class Main {
    
	 public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
			 
		   int s ;
		   System.out.println(" masukkan harga makanan:,apakah kode Voucher? (tulis 'ARKAFOOD5' atau ‘DITRAKTIRDEMY jika ada. jika tidak ketik'false' ), masukkan jarak:(dalam KM),apakah ada pajak? (true/false):  ");
		   System.out.print("arkaFood:" );
		   String a = input.nextLine();
		  
		   String[] A = a.split(",");
		   
		   int N = Integer.parseInt(A[0]);
		   String b = (A[1]);
		   int c = Integer.parseInt(A[2]);
		   boolean d = Boolean.parseBoolean(A[3]) ;
		   String FALSE = "false";
		   String F = "ARKAFOOD5";
		   String G = "DITRAKTIRDEMY";
			
		   int e,l,m, sum;

			if (c - 1.5 >= 0) {
				e = (int) (5000 + (c - 1.5) * 3000);
				System.out.println(+e);
				l =(int) (N*0.5);
				m =(int) (N*0.6);
				
				if (l<=50000||m<=25000) {
					
				
				if (b.equals(FALSE) && d == false) {
					sum = N + e;
					System.out.println(sum);
				}

				else if (b.equals(FALSE) && b != "false") {
					sum = (int) (N + e + N * 0.05);
					System.out.println(sum);
				} else if (N >= 50000) {
					if (b.equals(F) && d == false) {
						
						sum = (int) ((N- l) + e );
						System.out.println(sum);
					} else if (b.equals(F) && d != false) {
						sum = (int) (N + e - l + 0.05 * N);
						System.out.println(sum);
					}

				}
				else if (N >= 25000) {
					if (b.equals(G) && d == false) {

						sum = (int) (N + e - m);
						System.out.println(sum);
					} else if (b.equals(G) && d != false) {
						sum = (int) (N + e - m + 0.05 * N);
						System.out.println(sum);
					}

				}
			}
				else if (l>50000||m>=25000) {
					l = 50000;
					m = 25000;
					
					if (b.equals(FALSE) && d == false) {
						sum = N + e;
						System.out.println(sum);
					}

					else if (b.equals(FALSE) && b != "false") {
						sum = (int) (N + e + N * 0.05);
						System.out.println(sum);
					} else if (N >= 50000) {
						if (b.equals(F) && d == false) {
							
							sum = (int) ((N- l) + e );
							System.out.println(sum);
						} else if (b.equals(F) && d != false) {
							sum = (int) (N + e - l + 0.05 * N);
							System.out.println(sum);
						}

					}
					else if (N >= 25000) {
						if (b.equals(G) && d == false) {

							sum = (int) (N + e - m);
							System.out.println(sum);
						} else if (b.equals(G) && d != false) {
							sum = (int) (N + e - m + 0.05 * N);
							System.out.println(sum);
						}

					}
					
				}
			}
			else {

				e = (int) (5000*c);
				System.out.println(+e);
				l =(int) (N*0.5);
				m =(int) (N*0.6);
				
				if (l<=50000||m<=25000) {
					
				
				if (b.equals(FALSE) && d == false) {
					sum = N + e;
					System.out.println(sum);
				}

				else if (b.equals(FALSE) && b != "false") {
					sum = (int) (N + e + N * 0.05);
					System.out.println(sum);
				} else if (N >= 50000) {
					if (b.equals(F) && d == false) {
						
						sum = (int) ((N- l) + e );
						System.out.println(sum);
					} else if (b.equals(F) && d != false) {
						sum = (int) (N + e - l + 0.05 * N);
						System.out.println(sum);
					}

				}
				else if (N >= 25000) {
					if (b.equals(G) && d == false) {

						sum = (int) (N + e - m);
						System.out.println(sum);
					} else if (b.equals(G) && d != false) {
						sum = (int) (N + e - m + 0.05 * N);
						System.out.println(sum);
					}

				}
			}
				else if (l>50000||m>=25000) {
					l = 50000;
					m = 25000;
					
					if (b.equals(FALSE) && d == false) {
						sum = N + e;
						System.out.println(sum);
					}

					else if (b.equals(FALSE) && b != "false") {
						sum = (int) (N + e + N * 0.05);
						System.out.println(sum);
					} else if (N >= 50000) {
						if (b.equals(F) && d == false) {
							
							sum = (int) ((N- l) + e );
							System.out.println(sum);
						} else if (b.equals(F) && d != false) {
							sum = (int) (N + e - l + 0.05 * N);
							System.out.println(sum);
						}

					}
					else if (N >= 25000) {
						if (b.equals(G) && d == false) {

							sum = (int) (N + e - m);
							System.out.println(sum);
						} else if (b.equals(G) && d != false) {
							sum = (int) (N + e - m + 0.05 * N);
							System.out.println(sum);
						}

					}
					
				}
			}
		}

	}

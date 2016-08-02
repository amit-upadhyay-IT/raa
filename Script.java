package amit;

import java.io.*;
public class Script {
	
	public static void main(String []args) throws IOException
	{
		FileReader fileReader = new FileReader("/home/aupadhyay/Downloads/amit1.json");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		
		String j1[] = new String[14];
		int intJ1[] = new int[14];
		
		
		String dummy11 = bufferedReader.readLine();
		String dummy12 = bufferedReader.readLine();
		
		for(int i = 0; i < 14; ++i)
		{
			j1[i] = bufferedReader.readLine();
			j1[i] = j1[i].substring(28, 30);
			intJ1[i] = Integer.parseInt(j1[i]);
		}
		
		
		String dummy21 = bufferedReader.readLine();
		String dummy22 = bufferedReader.readLine();
		
		String j2[] = new String[14];
		int intJ2[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j2[i] = bufferedReader.readLine();
			j2[i] = j2[i].substring(28, 30);
			intJ2[i] = Integer.parseInt(j2[i]);
		}
		
		String dummy31 = bufferedReader.readLine();
		String dummy32 = bufferedReader.readLine();
		
		String j3[] = new String[14];
		int intJ3[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j3[i] = bufferedReader.readLine();
			j3[i] = j3[i].substring(28, 30);
			intJ3[i] = Integer.parseInt(j3[i]);
		}
		
		String dummy41 = bufferedReader.readLine();
		String dummy42 = bufferedReader.readLine();
		
		String j4[] = new String[14];
		int intJ4[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j4[i] = bufferedReader.readLine();
			j4[i] = j4[i].substring(28, 30);
			intJ4[i] = Integer.parseInt(j4[i]);
		}
		
		String dummy51 = bufferedReader.readLine();
		String dummy52 = bufferedReader.readLine();
		
		String j5[] = new String[14];
		int intJ5[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j5[i] = bufferedReader.readLine();
			j5[i] = j5[i].substring(28, 30);
			intJ5[i] = Integer.parseInt(j5[i]);
		}
		
		String dummy61 = bufferedReader.readLine();
		String dummy62 = bufferedReader.readLine();
		
		String j6[] = new String[14];
		int intJ6[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j6[i] = bufferedReader.readLine();
			j6[i] = j6[i].substring(28, 30);
			intJ6[i] = Integer.parseInt(j6[i]);
		}
		
		String dummy71 = bufferedReader.readLine();
		String dummy72 = bufferedReader.readLine();
		
		String j7[] = new String[14];
		int intJ7[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j7[i] = bufferedReader.readLine();
			j7[i] = j7[i].substring(28, 30);
			intJ7[i] = Integer.parseInt(j7[i]);
		}
		
		String dummy81 = bufferedReader.readLine();
		String dummy82 = bufferedReader.readLine();
		
		String j8[] = new String[14];
		int intJ8[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j8[i] = bufferedReader.readLine();
			j8[i] = j8[i].substring(28, 30);
			intJ8[i] = Integer.parseInt(j8[i]);
		}
		
		String dummy91 = bufferedReader.readLine();
		String dummy92 = bufferedReader.readLine();
		
		String j9[] = new String[14];
		int intJ9[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j9[i] = bufferedReader.readLine();
			j9[i] = j9[i].substring(28, 30);
			intJ9[i] = Integer.parseInt(j9[i]);
		}
		
		String dummy101 = bufferedReader.readLine();
		String dummy102 = bufferedReader.readLine();
		
		String j10[] = new String[14];
		int intJ10[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j10[i] = bufferedReader.readLine();
			j10[i] = j10[i].substring(28, 30);
			intJ10[i] = Integer.parseInt(j10[i]);
		}
		

		String dummy111 = bufferedReader.readLine();
		String dummy112 = bufferedReader.readLine();
		
		String j11[] = new String[14];
		int intJ11[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j11[i] = bufferedReader.readLine();
			j11[i] = j11[i].substring(28, 30);
			intJ11[i] = Integer.parseInt(j11[i]);
		}
		

		String dummy121 = bufferedReader.readLine();
		String dummy122 = bufferedReader.readLine();
		
		String j12[] = new String[14];
		int intJ12[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j12[i] = bufferedReader.readLine();
			j12[i] = j12[i].substring(28, 30);
			intJ12[i] = Integer.parseInt(j12[i]);
		}
		

		String dummy131 = bufferedReader.readLine();
		String dummy132 = bufferedReader.readLine();
		
		String j13[] = new String[14];
		int intJ13[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j13[i] = bufferedReader.readLine();
			j13[i] = j13[i].substring(28, 30);
			intJ13[i] = Integer.parseInt(j13[i]);
		}
		
		

		String dummy141 = bufferedReader.readLine();
		String dummy142 = bufferedReader.readLine();
		
		String j14[] = new String[14];
		int intJ14[] = new int[14];
		
		for(int i = 0; i < 14; ++i)
		{
			j14[i] = bufferedReader.readLine();
			j14[i] = j14[i].substring(28, 30);
			intJ14[i] = Integer.parseInt(j14[i]);
		}
		
		/*int cT[] = new int[14];
		// cT[0] -> contestant one total
		
		for(int k = 0; k < 14; ++k)
		{
			for(int l = 0; l < 14; ++l)
			{
			} 
		}
		*/
		
		int c1T = intJ1[0] + intJ2[0] + intJ3[0] + intJ4[0] + intJ5[0] + intJ6[0] + intJ7[0] + intJ8[0] + intJ9[0] + intJ10[0] + intJ11[0] + intJ12[0] + intJ13[0] + intJ14[0];
	
		int c2T = intJ1[1] + intJ2[1] + intJ3[1] + intJ4[1] + intJ5[1] + intJ6[1] + intJ7[1] + intJ8[1] + intJ9[1] + intJ10[1] + intJ11[1] + intJ12[1] + intJ13[1] + intJ14[1];
		
		int c3T = intJ1[2] + intJ2[2] + intJ3[2] + intJ4[2] + intJ5[2] + intJ6[2] + intJ7[2] + intJ8[2] + intJ9[2] + intJ10[2] + intJ11[2] + intJ12[2] + intJ13[2] + intJ14[2];
		
		int c4T = intJ1[3] + intJ2[3] + intJ3[3] + intJ4[3] + intJ5[3] + intJ6[3] + intJ7[3] + intJ8[3] + intJ9[3] + intJ10[3] + intJ11[3] + intJ12[3] + intJ13[3] + intJ14[3];
		
		int c5T = intJ1[4] + intJ2[4] + intJ3[4] + intJ4[4] + intJ5[4] + intJ6[4] + intJ7[4] + intJ8[4] + intJ9[4] + intJ10[4] + intJ11[4] + intJ12[4] + intJ13[4] + intJ14[4];
		
		int c6T = intJ1[5] + intJ2[5] + intJ3[5] + intJ4[5] + intJ5[5] + intJ6[5] + intJ7[5] + intJ8[5] + intJ9[5] + intJ10[5] + intJ11[5] + intJ12[5] + intJ13[5] + intJ14[5];

		int c7T = intJ1[6] + intJ2[6] + intJ3[6] + intJ4[6] + intJ5[6] + intJ6[6] + intJ7[6] + intJ8[6] + intJ9[6] + intJ10[6] + intJ11[6] + intJ12[6] + intJ13[6] + intJ14[6];
		
		int c8T = intJ1[7] + intJ2[7] + intJ3[7] + intJ4[7] + intJ5[7] + intJ6[7] + intJ7[7] + intJ8[7] + intJ9[7] + intJ10[7] + intJ11[7] + intJ12[7] + intJ13[7] + intJ14[7];
		
		int c9T = intJ1[8] + intJ2[8] + intJ3[8] + intJ4[8] + intJ5[8] + intJ6[8] + intJ7[8] + intJ8[8] + intJ9[8] + intJ10[8] + intJ11[8] + intJ12[8] + intJ13[8] + intJ14[8];
		
		int c10T = intJ1[9] + intJ2[9] + intJ3[9] + intJ4[9] + intJ5[9] + intJ6[9] + intJ7[9] + intJ8[9] + intJ9[9] + intJ10[9] + intJ11[9] + intJ12[9] + intJ13[9] + intJ14[9];
		
		int c11T = intJ1[10] + intJ2[10] + intJ3[10] + intJ4[10] + intJ5[10] + intJ6[10] + intJ7[10] + intJ8[10] + intJ9[10] + intJ10[10] + intJ11[10] + intJ12[10] + intJ13[10] + intJ14[10];
		
		int c12T = intJ1[11] + intJ2[11] + intJ3[11] + intJ4[11] + intJ5[11] + intJ6[11] + intJ7[11] + intJ8[11] + intJ9[11] + intJ10[11] + intJ11[11] + intJ12[11] + intJ13[11] + intJ14[11];
		
		int c13T = intJ1[12] + intJ2[12] + intJ3[12] + intJ4[12] + intJ5[12] + intJ6[12] + intJ7[12] + intJ8[12] + intJ9[12] + intJ10[12] + intJ11[12] + intJ12[12] + intJ13[12] + intJ14[12];
		
		int c14T = intJ1[13] + intJ2[13] + intJ3[13] + intJ4[13] + intJ5[13] + intJ6[13] + intJ7[13] + intJ8[13] + intJ9[13] + intJ10[13] + intJ11[13] + intJ12[13] + intJ13[13] + intJ14[13];
		
		System.out.println("Contestant 1 marks : "+c1T);
		System.out.println("Contestant 2 marks : "+c2T);
		System.out.println("Contestant 3 marks : "+c3T);
		System.out.println("Contestant 4 marks : "+c4T);
		System.out.println("Contestant 5 marks : "+c5T);
		System.out.println("Contestant 6 marks : "+c6T);
		System.out.println("Contestant 7 marks : "+c7T);
		System.out.println("Contestant 8 marks : "+c8T);
		System.out.println("Contestant 9 marks : "+c9T);
		System.out.println("Contestant 10 marks : "+c10T);
		System.out.println("Contestant 11 marks : "+c11T);
		System.out.println("Contestant 12 marks : "+c12T);
		System.out.println("Contestant 13 marks : "+c13T);
		System.out.println("Contestant 14 marks : "+c14T);
		
		
	
		
	}

}

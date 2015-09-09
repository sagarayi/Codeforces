/*
A. Triangle
time limit per test
2 seconds
memory limit per test
64 megabytes
input
standard input
output
standard output

Johnny has a younger sister Anne, who is very clever and smart. As she came home from the kindergarten, she told his brother about the task that her kindergartener asked her to solve. The task was just to construct a triangle out of four sticks of different colours. Naturally, one of the sticks is extra. It is not allowed to break the sticks or use their partial length. Anne has perfectly solved this task, now she is asking Johnny to do the same.

The boy answered that he would cope with it without any difficulty. However, after a while he found out that different tricky things can occur. It can happen that it is impossible to construct a triangle of a positive area, but it is possible to construct a degenerate triangle. It can be so, that it is impossible to construct a degenerate triangle even. As Johnny is very lazy, he does not want to consider such a big amount of cases, he asks you to help him.
Input

The first line of the input contains four space-separated positive integer numbers not exceeding 100 — lengthes of the sticks.
Output

Output TRIANGLE if it is possible to construct a non-degenerate triangle. Output SEGMENT if the first case cannot take place and it is possible to construct a degenerate triangle. Output IMPOSSIBLE if it is impossible to construct any triangle. Remember that you are to use three sticks. It is not allowed to break the sticks or use their partial length.
*/
import java.io.*;
import java.util.*;
public class psetsixa
{
	public static boolean tri(int a,int b,int c)
	{
		if ((a<(b+c)) && (b<(a+c)) && (c<(a+b)))
			return true;
		return false;
	}
	public static boolean seg(int a,int b,int c)
	{
		return ((a==(b+c)) || (b==(a+c)) || (c==(a+b)));
	} 
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());

		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		boolean res=false;
		boolean deg=false;

		res=res||tri(a,b,c);
		res=res||tri(b,c,d);
		res=res||tri(a,b,d);
		res=res||tri(a,c,d);

		deg=deg||seg(a,b,c);
		deg=deg||seg(b,c,d);
		deg=deg||seg(a,b,d);
		deg=deg||seg(a,c,d);

		if(res)
		{
			System.out.println("TRIANGLE");
		}
		else if(deg)
		{
			System.out.println("SEGMENT");
		}
		else
		{
			System.out.println("IMPOSSIBLE");
		}

		
	}
}
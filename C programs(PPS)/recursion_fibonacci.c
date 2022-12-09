//program to find fibonacci series using recursion 
#include<stdio.h>
 
int Fibonacci(int);
 
int main()
{
   int n, i = 0, c;
   printf("Enter a number upto how many terms u need series: ");
   scanf("%d",&n);
 
   printf("Fibonacci series\n");
 
   for ( c = 1 ; c <= n ; c++ )
   {
      printf("%d\n", Fibonacci(i));
      i++; 
   }
 
   return 0;
}
 
int Fibonacci(int i)
{
   if ( i == 0 )
      return 0;
   else if ( i == 1 )
      return 1;
   else
      return ( Fibonacci(i-1) + Fibonacci(i-2) );
} 
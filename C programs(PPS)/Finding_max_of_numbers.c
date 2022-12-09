/*program to find maximum of given number*/
#include<stdio.h>
int main()
{
int a[50],n,i,max;
printf("Enter number of elements in an Array\n"); 
scanf("%d",&n);
printf("Enter %d elements to array\n",n); 
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
max=a[0];
for(i=1;i<n;i++)
{
if(max<a[i])
 max=a[i];
}
printf("The maximum value of given array elements is %d\n",max); 
return 0;
}
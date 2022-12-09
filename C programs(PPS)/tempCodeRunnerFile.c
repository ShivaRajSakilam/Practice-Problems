/*program to find maximum of given number*/
#include<stdio.h>
int main()
{
int a[50],n,i,max;
/number of elements/
printf("Enter number of elements in an Array\n"); 
scanf("%d",&n);
//enter elements in array
printf("Enter %d elements to array\n",n); 
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
//intial a[0] as max
max=a[0];
//checking a[0]&a[1]---n
for(i=1;i<n;i++)
{
if(max<a[i])
 max=a[i];
}
//printing the max value
printf("The maximum value of given array elements is %d\n",max); 
return 0;
}
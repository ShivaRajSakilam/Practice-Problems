/*2D Array Addition of two matrices*/

#include<stdio.h>
int main()
{
    int i,j,a[2][2],b[2][2],sum[2][2];
    printf("enter the values of first matrix\n");
    for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        scanf("%d\n",&a[i][j]);
    }
    
    printf("enter the values of second matrix\n");
     for(i=0;i<2;i++)
    {
        for(j=0;j<2;j++)
        scanf("%d\n",&b[i][j]);
    }
    sum[2][2]=a[2][2]+b[2][2];
    printf("sum of two matrices is : %d\n",sum);
return 0;

}
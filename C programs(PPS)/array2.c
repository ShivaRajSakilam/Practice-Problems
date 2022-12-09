/*array with scanf*/

#include<stdio.h>
int main()
{
    int marks[5],i;
        printf("Enter the marks of 5 subjects\n");
    for(i=0;i<=4;i++)
        scanf("%d\n",&marks[i]);
    for(i=0;i<=4;i++)
        printf("the marks of marks[%d]:%d\n",i,marks[i]);
        
return 0;
}
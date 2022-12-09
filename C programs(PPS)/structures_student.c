// programs based on structures

#include <stdio.h>
struct student{
    char *name;
    int roll_no;
    int marks;
};
int main()
{
    struct student s1;
    printf("Enter your Name, Roll Number and Marks\n");
    scanf("%s%d%d",s1.name, &s1.roll_no, &s1.marks);
    printf("Name:%s Roll Number:%d Marks:%d", s1.name, s1.roll_no, s1.marks);
    return 0;

}
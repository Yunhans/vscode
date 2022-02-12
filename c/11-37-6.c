#include <stdio.h>
#include <stdlib.h>
int main(void){
    struct date{
        int month;
        int day;
    };
    struct data{
        char name[10];
        int math;
        struct date birthday;
    };
    struct data s1;
    printf("學生姓名: ");
    scanf("%s",&s1.name);
    printf("幾月生日: ");
    scanf("%d",&s1.birthday.month);
    printf("幾日生日: ");
    scanf("%d",&s1.birthday.day);
    printf("數學成績: ");
    scanf("%d",&s1.math);
    printf("學生姓名:%s\n",s1.name);
    printf("生日:%d月%d日\n",s1.birthday.month,s1.birthday.day);
    printf("數學成績:%d\n",s1.math);
    system("pause");
    return 0;
}
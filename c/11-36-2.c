#include <stdio.h>
#include <stdlib.h>
int main(void){
    struct data{
        int year;
        int month;
        int day;
    };
    struct data holiday = {2004,4,26};
    printf("%02d/%02d/%04d",holiday.month,holiday.day,holiday.year);
    system("pause");
    return 0;
}
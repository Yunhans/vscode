#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int year;
    printf("閏年分辨\n請輸入一個西洋年:");
    scanf("%d",&year);

    if(year%4000 == 0){
        printf("%d非閏年\n",year);
    }else if(year%400 == 0){
        printf("%d是閏年\n",year);
    }else if(year%100 == 0){
        printf("%d非閏年\n",year);
    }else if(year%4 == 0){
        printf("%d是閏年\n",year);
    }else{
        printf("%d非閏年\n",year);
    }
    
    system("pause");
    return 0;
}
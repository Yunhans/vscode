#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    float stringLong = 3000;
    int i = 1;
    while(stringLong>=5){
        stringLong=stringLong/2;
        i++;
    }
    printf("%d days",i-1);
    system("pause");
    return 0;
}
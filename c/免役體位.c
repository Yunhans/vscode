#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int height;
    printf("輸入役男身高: ");
    scanf("%d",&height);

    if( height<=157 || height>=196 )
    {
        printf("免役體位\n");
    }

    system("pause");
    return 0;
}
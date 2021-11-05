#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    float x,y;
    printf("這是一個判斷座標位置的程式\n請輸入x座標值:");
    scanf("%f",&x);
    printf("請輸入y座標值:");
    scanf("%f",&y);
    if(x==0 && y==0)
        printf("原點\n");
    else if(y==0)
        printf("x軸\n");
    else if(x==0)
        printf("y軸\n");
    else if(x>0)
        if(y>0)
            printf("第一象限\n");
            else
                printf("第四象限\n");
    else 
        if(y>0)
            printf("第二象限\n");
            else
                printf("第三象限\n");
    system("pause");
    return 0;
}

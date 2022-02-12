#include <stdio.h>
#include <stdlib.h>

int main(void){
    int i,j;
    float temp[3][4]={
        {18.2,17.3,15.0,13.4},
        {23.8,25.1,20.6,17.8},
        {20.6,21.5,18.4,15.7}
    };
    char week[4][10]={"星期一", "星期二", "星期三", "星期四"},time[4][10]={"      ", "時段一", "時段二", "時段三"};
    //a
    for(i=0;i<4;i++){
        printf("| %s | ",time[i]);
        if(i==0){
            for(j=0;j<4;j++){
                printf("%s | ",week[j]);
            }
            printf("\n");
        }else{
            for(j=0;j<4;j++){
                printf(" %4.1f  | ",temp[i-1][j]);
            }
            printf("\n");
        }
    }
    //b
    float sum;
    for(i=0,sum=0;i<3;i++){
        for(j=0;j<4;j++){
            sum+=temp[i][j];
        }
    }
    printf("每日的平均溫度為%.2f度\n",sum/12);
    //c
    float sum1,sum2,sum3;
    for(j=0,sum1=0,sum2=0,sum3=0;j<4;j++){
        sum1+=temp[0][j];
        sum2+=temp[1][j];
        sum3+=temp[2][j];
    }
    printf("時段一平均氣溫為%.2f度\n",sum1/4);
    printf("時段二平均氣溫為%.2f度\n",sum2/4);
    printf("時段三平均氣溫為%.2f度\n",sum3/4);
    //d,e
    float max,min;
    int maxi,maxj,mini,minj;
    for(i=0,maxi=0,maxj=0,mini=0,minj=0,max=temp[0][0],min=temp[0][0];i<3;i++){
        for(j=0;j<4;j++){
            if(max < temp[i][j]){
                max = temp[i][j];
                maxi=i;
                maxj=j;
            }
            if(min > temp[i][j]){
                min = temp[i][j];
                mini=i;
                minj=j;
            }
        }
    }
    printf("在%s的%s時，有最高溫%.1f度\n",week[maxj],time[maxi+1],max);
    printf("在%s的%s時，有最低溫%.1f度\n",week[minj],time[mini+1],min);

    system("pause");
    return 0;
}
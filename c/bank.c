#include <stdio.h>
#include <math.h>

int main(){
    long p;
    int n1,n2,t;
    double emi1=0,emi2=0,x,y,temp;
    scanf("%ld %d %d ",&p,&t,&n1);
    while(n1--){
        scanf("%lf",&x);
        temp = pow( (1 - 1 / (1 + x)),(t * 12));
        emi1=emi1 + p * x /temp;
     
        
    }
    scanf("%d",&n2);
    while(n2--){
        scanf("%lf",&y);
        temp = pow( (1 - 1 / (1 + y)),(t * 12));
        emi2=emi2 + p * y /temp ;
       
    }
    if(emi1<emi2){
        printf("\nBank A");
    }else{
        printf("\nBank B");

    }
    return 0;
}
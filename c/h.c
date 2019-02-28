#include <stdio.h>

int length(char s[]){
    int i,l=0;
    for(i=0;s[i]!='\0';i++){
        l++;
    }

    return l;
}
int main(){
    char s[]="hello";
    int len,i,j;

    len = length(s);
    printf("%d",len);
    for(i=0;i<=len;i++){
        for(j=0;j<=i;j++){
            printf("%c",s[j]);
        }
        printf("\n");
    }


    return 0;
}
//C program to reverse string in same variable, without using another string variable to reverse.
#include <stdio.h>
int strLen(char str[]){
    int len=0,i;
    for(i=0;str[i]!='\0';i++){
        len++;
    }
    return len;
}
int main(){
    char str[40],temp;
    int i,len;
    printf("Enter any String: ");
    scanf("%[^\n]s",str);
    printf("\nEntered String: %s",str);
    len=strLen(str);
    for(i=0;i<=len/2;i++){
        temp=str[i];
        str[i]=str[len-i-1];
        str[len-i-1]=temp;
    }

    printf("\nReverse: %s\n",str);

    return 0;
}
//C program to toggle case of all characters of string.(convert upper to lower n lower to upper)
#include <stdio.h>
int main(){
    char str[40];
    int i;
    printf("Enter any String: ");
    scanf("%[^\n]s",str);
    printf("\nEntered String: %s",str);

    for(i=0;str[i]!='\0';i++){
        if(str[i]>='A'&&str[i]<='Z' || str[i]>='a'&&str[i]<='z'){
            if(str[i]>='A'&&str[i]<='Z'){
                str[i]=str[i]+32;
            }else{
                str[i]=str[i]-32;
            }
        }
    }
    printf("\nToggle Case: %s\n",str);
    
    return 0;
}
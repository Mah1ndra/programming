//C program to count upper case, lower case and special characters in a string
#include <stdio.h>
#define s 50
int main(){
    char str[s];
    int i,cl,cu,cs;
    printf("Enter any String: ");
    scanf("%[^\n]s",str);
    printf("\nEntered String: %s",str);
    cl=cu=cs=0;

    for(i=0;str[i]!='\0';i++){
        if(str[i]>='A'&&str[i]<='Z' || str[i]>='a'&&str[i]<='z'){
            if(str[i]>='A'&&str[i]<='Z'){
                cu++;
            }else{
                cl++;
            }
        }else{
            cs++;
        }
    }
    printf("\nUpperCase: %d\n",cu);
    printf("LowerCase: %d\n",cl);
    printf("Special: %d\n",cs);

    return 0;

}
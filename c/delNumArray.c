//Delete Given Number from the array
#include <stdio.h>
#define size 10

int main(){
    int n,i,temp,found,pos,e,a[size];
    printf("Enter Num of Elemets into Array: ");
    scanf("%d",&n);
    printf("\nEnter %d Elements into Array: \n",n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("\n Enter an Element to be deleted: ");
    scanf("%d",&e);
    printf("\n Elements before Deletion: \n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    printf("\nElements After Deletion: \n");
    for(i=0;i<n;i++){
        if(a[i]==e){
            found = 1;
            pos = i;
            break;
        }
    }
    if(found==1){
        for(i=pos;i<n-1;i++){
            a[i]=a[i+1];
        }

        for(i=0;i<n-1;i++){
            printf("%d ",a[i]);
        }
    }else{
        printf("\nElement %d not found in the array",e);
    }

    printf("\n");
    return 0;
}
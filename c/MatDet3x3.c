//Determinant of a 3x3 Matrix
#include <stdio.h>
#define s 3
int main(){
    int i,det=0,j,a[s][s];
    printf("Enter the elements into 3x3 matrix: \n");
    for(i=0;i<s;i++){
        for(j=0;j<s;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nMatrix: \n");
    for(i=0;i<s;i++){
        for(j=0;j<s;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }

    det = a[0][0]*(a[1][1]*a[2][2] - a[1][2]*a[2][1]) - a[0][1]*(a[1][0]*a[2][2] - a[1][2]*a[2][0]) + a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    printf("\nDeterminent: %d\n",det);
    
    return 0;
}
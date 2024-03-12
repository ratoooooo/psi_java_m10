#include <stdlib.h>
#include <stdio.h>

void main() {
    int i;
    int soma = 0; 

    for (i = 0; i < 10; i++) {
        int temp;
        scanf("%d", &temp); 
        soma += temp; 
    }

    printf("%d", soma); // Print the final sum
}

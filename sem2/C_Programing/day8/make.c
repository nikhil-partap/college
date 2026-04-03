// take 5 numbers from the students 
// 

#include <stdio.h>

void quickSort(int arrLen , int arr[]){

    if (arrLen <= 1){
        return  ;
    }

    int mid = arrLen/2;
    int pivot = arr[mid];
    int templess[arrLen];
    int count1 = 0;
    int tempmore[arrLen];
    int count2 = 0;


    // int *ptr  = arr;
    for (int i =0 ; i  < arrLen; i ++){
        if (arr[i] <= pivot){
            // add the element to the arrless
            templess[count1] = arr[i];
            count1 ++;
        } else {
            // add the element to arrmore 
            tempmore[count2] = arr[i];
            count2 ++;
        }
    }

    quickSort(count1, templess);
    quickSort(count2, tempmore);
    
    int index = 0;
    for(int i = 0; i < count1; i ++){
        arr[index] = templess[i];
        index ++;
    }
    // arr[index] = pivot;

    for(int i 0; i < count2; i ++){
        arr[index] = tempmore[i];
        index ++;
    }




}


int main(){

    int input_no ;
    scanf("%d", &input_no);
    
    int nos[input_no];
    int *ptr = nos;

    for(int i = 0; i < input_no; i++){
        scanf("%d", (ptr + i));
    }
    float avg =0;
    int highest = *ptr;
    int lowest = *ptr;

    for(int i = 0; i < input_no; i++){
        avg += *(ptr  +i);
        if(*(ptr  +i) < lowest){
            lowest = *(ptr  +i);
        }
        if(*(ptr  +i) > highest){
            highest = *(ptr  +i);
        }
    }
    avg /= input_no;

    int above_avg = 0;
    for(int i = 0; i < input_no; i++){
        if(*(ptr  +i) > avg){
            above_avg++;
        }
    }
    int below_avg = input_no - above_avg;


    printf("the avg is %.2f\n", avg);
    printf("the highest is %d\n", highest);
    printf("the lowest is %d\n", lowest);
    printf("the number of students above average is %d\n", above_avg);
    printf("the number of students bellow average is %d\n", below_avg);

    return 0;
}
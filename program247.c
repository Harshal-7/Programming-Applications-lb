// Accept 2 file name &  Compare them

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdbool.h>
#include<string.h>

int main()
{
    char Fname[20];
    int fd = 0;
    char Data[10];

    printf("Enter the file name:\n");
    scanf("%s",Fname);

    fd =  open(Fname,O_RDONLY);
    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return -1;
    }

    // 0 Starting Point
    // 1 Current Posiiton
    // 2 End Point

    lseek(fd,10,0);     // lseek(kashat,kiti,kuthun)

    read(fd,Data,5);

    write(1,Data,5);

    return 0;
}
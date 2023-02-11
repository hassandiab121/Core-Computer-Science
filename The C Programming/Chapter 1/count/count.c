#include<stdio.h>
#include <string.h>


int numOfLines(char);
int numOfBlanks(char);
int numOfTabs(char);


/*program count tabs, blanks and new lines */
int main()
{
    /*input text stream appears as a sequence of lines,
     EACH LINE TERMINATED BY A NEWLINE ( \n ). 
     Hence, counting lines is just counting newline.
     */
    int choose, c, line  = 0, blank = 0, tab = 0;
    printf("type (1 or 2) \n 1 - if you want to input text and count it \n 2 - if you want to add a file and count it \n ");
    scanf("%d" , &choose);

    if (choose == 1)
    {
        printf("Enter your text followed by space + ctrl z when you want to end the input process \n");
         while ((c = getchar()) != EOF )
        if (c == '\n')
            line++;
    }

    else if (choose == 2)
    {
        printf("Enter the name of the .txt file  \n ");
        char nameOfFile[50];
        scanf("%123s", nameOfFile);
        strcat(nameOfFile,".txt");

        FILE *f;
        f = fopen(nameOfFile, "r");
        if (NULL == f) 
        printf("file can't be opened \n");
           
        printf("text on the file[%s]: \n", "text.txt");
        char ch;
        while ((ch=getc(f))!=EOF) //reading the character from file until f equals to EOF
        {
          putchar(ch);
          line += numOfLines(ch);
          tab += numOfTabs(ch);
          blank += numOfBlanks(ch);
          
        }
    
        fclose(f);    
    }
     
    printf("\nnumbers of lines %d \nnumber of blanks %d\nnumber of tabs %d \n", line , blank, tab);
    
    return 0;
}

int numOfLines(char c)
{
    return c == '\n' ? 1 : 0;
}

int numOfBlanks(char c)
{
     return c == 32 ? 1 : 0;
}
int numOfTabs(char c){
    return c == '\t' ? 1 : 0;
}

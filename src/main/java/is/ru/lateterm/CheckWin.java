   package is.ru.lateterm;

   public class CheckWin       //EMPTY BOARD WIN CHECK
   {   
        static char board[] = new char[10];
        //int x1, x2, x3, x4. x5;
        public static int Line(int x1, int x2, int x3, int x4, int x5)
        {
            for(int i = 1; i < 10; i++)
            {
                board[i] = '\0';

                if(i == x1 || i == x2 || i == x3 || i == x4 || i == x5)
                    board[i] = 'X';
            } 

            for (int n = 1; n <= 7;) 
            {    // 1, 2, 3 - 4, 5, 6 - 7, 8, 9               
                if (board[n] == 'X' && board[n] == board[n + 1] && board[n + 1] == board[n + 1 + 1]) 
                {
                    return 1; //Player wins                   
                }
                n = n + 3;
            }

            for (int n = 1; n <= 3; n++) 
            {   // 1, 4, 7 - 2, 5, 8 - 3, 6, 9
                if (board[n] == 'X' && board[n] == board[n + 3] && board[n + 3] == board[n + 3 + 3]) 
                {
                    return 1; //Player wins                                          
                }
            }
            if (board[1] == 'X' && board[1] == board[5] && board[5] == board[9]) 
            {
                    return 1;
            }
            if (board[3] == 'X' && board[3] == board[5] && board[5] == board[7]) 
            {
                    return 1;
            }

        return 0; //No winning combinations 
    }
}

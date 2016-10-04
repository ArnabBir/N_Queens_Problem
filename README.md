# N_Queens_Problem

Explanation:

The N Queen is the problem of placing N chess queens on an N×N chessboard so that no two queens attack each other. For example, following is a solution for 4 Queen problem.

The expected output is the number of possible combinations in which  queens can be placed. 

Approach:

while there are untried configurations
{
   generate the next configuration
   
   if queens don't attack in this configuration then
   
   {
   
      Increment count
   
   }
}

Backtracking Algorithm:

The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this row and column as part of the solution. If we do not find such a row due to clashes then we backtrack and return false.

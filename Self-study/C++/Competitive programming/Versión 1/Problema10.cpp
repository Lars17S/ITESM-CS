//Buscar hasta raíz de x
#include "iostream"
#include "math.h"
using namespace std;

int main() {
  int luckyPos, inputCount, saveNum, currentNum;
  int j, k; //Iterators
  int primeList[12] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 27, 29, 31};
  saveNum = 1;
  cin >> luckyPos;

  inputCount = 0;
  while(luckyPos != inputCount) {
    currentNum = saveNum;
    j = 0; //Iterator for primeList
    k = 0; //Iterator to count the number of different prime numbers factors found
    if (currentNum != 2 || currentNum != 3 || currentNum != 5 || currentNum != 7 || currentNum != 11 || currentNum != 13
    || currentNum != 17 || currentNum != 19 || currentNum != 23 || currentNum != 27 || currentNum != 31) {
    while(primeList[j] <= sqrt(currentNum)) { //PROBLEMA CON PRIMOS AFTER 31
      if(currentNum % primeList[j] == 0) {
        k = k + 1;
        while (currentNum % primeList[j] == 0 {
          currentNum = currentNum / primeList[j];
        }
      }
      cout << currentNum << endl;
      ++j;
    }
    }
    if (k >= 3)
      inputCount++;
    saveNum++;
  }
  cout << "The number is: "<< saveNum << endl;
  return 0;
}

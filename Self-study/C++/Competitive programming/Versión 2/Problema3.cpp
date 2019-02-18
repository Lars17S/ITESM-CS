/* Bézout's identity
From Wikipedia, the free encyclopedia
Jump to navigationJump to search
This article is about Bézout's theorem in arithmetic. For Bézout's theorem in algebraic geometry, see Bézout's theorem.
In elementary number theory, Bézout's identity (also called Bézout's lemma) is the following theorem:

Bézout's identity — Let a and b be integers with greatest common divisor d. Then, there exist integers x and y such that ax + by = d. More generally, the integers of the form ax + by are exactly the multiples of d.
*/


//MEJORAR A MERGE SORT, VER HOJA CON APUNTES PARA ENTENDER
#include "iostream"
using namespace std;

int main() {
  int num[3];
  int previous, current;
  int j, i, key;


  cout << "Write two integers numbers. First the smallest number" << endl;
  cin >> num[0];
  cin >> num[1];

  if (num[0] > num[1]) {
    num[2] = num[1];
    num[1] = num[0];
    num[0] = num[2];
  }
  //Ver hoja con apuntes
  //Que el 0 sea el más pequeño
  do {
    num[2] = num[1] - num[0];
    previous = num[2];

    for (i = 0; i < 3; ++i)
    {
      j = i - 1; //INSERTION SORT
      key = num[i];
      while(key < num[j] && j >= 0) {
        num[j + 1] = num[j];
        j = j - 1;
      }
      num[j + 1] = key;
    }
    current = num[1] - num[0];
  } while(previous != current);

  cout << current;
    //Ahora el 0 es el mas pequeño, el 1 el segundo mas pequeño
  return 0;
}

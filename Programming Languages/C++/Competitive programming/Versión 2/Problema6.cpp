#include "iostream"
#include "vector"
using namespace std;
int reversing(int num);

int main() {
  int cases;

  cout << "INPUT:" << endl;
  cout << "Cases: ";
  cin >> cases;
  int *firstInt = new int[cases];
  int *secondInt = new int[cases];
  int *result = new int[cases];

  for (int i = 0; i < cases; ++i) {
    cout << "Input first integer number case[" << i + 1 << "]: ";
    cin >> firstInt[i];
    cout << "Input second integer number case[" << i + 1 << "]: ";
    cin >> secondInt[i];
  }

  cout << "\nOUTPUT" << endl;
  for (int i = 0; i < cases; ++i) {
    firstInt[i] = reversing(firstInt[i]);
    secondInt[i] = reversing(secondInt[i]);
    result[i] = firstInt[i] + secondInt[i];
    result[i] = reversing(result[i]);
    cout << result[i] << endl;
  }

  delete[] firstInt;
  delete[] secondInt;
  delete[] result;
  return 0;
}

int reversing(int num) {
  vector<int> numDigit;
  int i, j, key;
  int decimal = 10;

  while(num >= 1) { //Until num < 1, there is no more integer number
    numDigit.push_back(num % decimal); //Push the last digit into the last position of vector
    num = num/decimal; //Removes the last digit of num dividing by ten
  }

  num = 0;
  decimal = 1;
  for (i = numDigit.size() - 1; i >= 0; i--) { //Insert each digit of the vector starting from the end
    num += numDigit.at(i) * decimal; //Set the correct 10 potential position
    decimal *= 10; //Increment decimal factor
  }
  return num; //Return the inverse number
}

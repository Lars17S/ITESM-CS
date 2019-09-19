#include "iostream"
#include "vector"
using namespace std;

int main() {
  int numCases, smallerValues, inputN, inputK;
  int i, j;
  vector <int> valueN;
  vector <int> valueK;
  cout << "\nINPUT (to exit input -1 -1): " << endl;

  do {
    cout << "Write the value N: ";
    cin >> inputN;
    cout << "Write the value K: ";
    cin >> inputK;
    valueN.push_back(inputN);
    valueK.push_back(inputK);
  } while(inputN != -1 || inputK != -1);

  cout << endl;
  for (i = 0, j = 1; i < valueN.size(); ++i) {
    smallerValues = 0;
    numCases = ((valueN.at(i) - 1) * valueN.at(i)) / 2; //Sum n(n+1)/2, but n = n - 1
    j = 1;
    while((valueK.at(i) - 2 * j) > 0) {
      smallerValues += (valueK.at(i) - 2 * j);
      ++j;
    }
    if (smallerValues != 0 && numCases != 0 && numCases != smallerValues)
      cout << smallerValues << "/" << numCases << endl;
  }

  return 0;
}

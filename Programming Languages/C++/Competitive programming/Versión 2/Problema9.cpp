//Triangle
#include "iostream"
#include "math.h"
#include "iomanip" //To set precision
using namespace std;
double calculate (double hypotenuse, double area);
bool isPossible(double hypotenuse, double area);

int main() {
  int cases;
  double side_a, side_b;

  cout << "INPUT" << endl;
  cout << "Write the number of cases: ";
  cin >> cases;
  double *hypotenuse = new double[cases];
  double *area = new double[cases];

  for (int i = 0; i < cases; ++i) {
    cout << "Hypotenuse [" << i + 1 << "]: ";
    cin >> hypotenuse[i];
    cout << "Area [" << i + 1 << "]: ";
    cin >> area[i];
  }

  cout << "OUTPUT: " << fixed << setprecision(6) << endl; //To set precision to 6 decimals (fixed and setprecision())
  for (int i = 0; i < cases; ++i) {
    if (isPossible(hypotenuse[i], area[i]) == true) { //Here check if exists
      side_a = calculate(hypotenuse[i], area[i]);
      side_b = 2 * (area[i] / side_a);
      cout << side_a << " " << side_b << " " << hypotenuse[i] << endl;
    }
    else
      cout << "-1" << endl;
  }

  return 0;
}

double calculate (double hypotenuse, double area) {
    return sqrt((pow(hypotenuse, 2) + sqrt(pow(hypotenuse, 4) - 16*pow(area, 2)))/2);
}

bool isPossible (double hypotenuse, double area) {
  if ((pow(hypotenuse, 2) - 4*area) < 0)
    return false;
  else
    return true;
}

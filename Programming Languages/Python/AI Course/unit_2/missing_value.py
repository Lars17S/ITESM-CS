import os
import pandas as pd
# na_values Additional strings to recognize as NA/NaN. In other words, transforms to NA/NaN type the strings
# NA or ? detected
df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])

# If horsepower columns has NA o nule values (NaN default, NA, or ?), then prints True, otherwise false
# f-strings, Formatted string literals. F-strings. It makes string interpolation simpler
print(f"horsepower has na? {pd.isnull(df['horsepower']).values.any()}")

print("Filling missing values...")

# Usually, the NA values are filled using the median
# Get the median of horsepower column
# Median is not sensitive to outliers values (unusually high or low values)
med = df['horsepower'].median()
df['horsepower'] = df['horsepower'].fillna(med)

print(f"horsepower has na? {pd.isnull(df['horsepower']).values.any()}")
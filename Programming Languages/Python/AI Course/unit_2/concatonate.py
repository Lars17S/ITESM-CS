import os
import pandas as pd
from IPython.display import display

# Rows and columns can be concatenated together to form new data frames

df = pd.read_csv("https://data.heatonresearch.com/data/t81-558/auto-mpg.csv", na_values=['NA', '?'])

col_horsepower = df['horsepower']
col_name = df['name']
# axis = 1 refers to concatonate as columns
result = pd.concat([col_name, col_horsepower], axis = 1)
# axis = 0 refers to concatonate as rows. [-2:] refers -2 from the end to end
result2 = pd.concat([df[0:2], df[-2:]], axis = 0)
display(result[0:5])
display(result2)
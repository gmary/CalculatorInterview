# Step 3

Now your method should accept a first line with the delimiter configuration before the numbers.

Examples:
`"\\[delim]\n1delim5delim8delim98delim178delim154"` should return `444`
or
`"\\[|]\n1|5|8|98|178|154"` should return `444`

The first line is optional an all existing scenarios should still be supported.
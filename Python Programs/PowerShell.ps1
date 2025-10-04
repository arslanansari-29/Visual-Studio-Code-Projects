# Declare variables
$number1 = 10
$number2 = 20
$text = "Hello, PowerShell!"
$isTrue = $true

# Perform arithmetic expressions
$sum = $number1 + $number2
$difference = $number2 - $number1
$product = $number1 * $number2
$quotient = $number2 / $number1

# Output the results
Write-Output "Sum: $sum"
Write-Output "Difference: $difference"
Write-Output "Product: $product"
Write-Output "Quotient: $quotient"

# Perform string concatenation
$greeting = $text + " Let's automate tasks."
Write-Output $greeting

# Logical expression
if ($isTrue -and $number1 -lt $number2) {
    Write-Output "Both conditions are true."
} else {
    Write-Output "Conditions are not met."
}

// Function to calculate the result
function calculate() {
    const display = document.getElementById("display");
    try {
        display.value = eval(display.value);
    } catch (error) {
        display.value = "Error";
    }
}

for (let i = 0; i <= 9; i++) {
    const button = document.getElementById(i.toString());
    if (button) {
        button.addEventListener("click", function() {
            document.getElementById("display").value += i;
        });
    }
}

const operators = ["add", "subtract", "multiply", "divide"];
operators.forEach(operator => {
    const button = document.getElementById(operator);
    button.addEventListener("click", function() {
        document.getElementById("display").value += operator === "add" ? "+" : operator === "subtract" ? "-" : operator === "multiply" ? "*" : "/";
    });
});

document.getElementById("clear").addEventListener("click", function() {
    document.getElementById("display").value = "";
});


document.getElementById("calculate").addEventListener("click", calculate);

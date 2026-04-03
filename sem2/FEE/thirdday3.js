<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>JS Logic Laboratory</title>
    <style>
      /* Simple, raw CSS for readability */
      body { font-family: monospace; padding: 20px; background: #eee; }
      .container { max-width: 900px; margin: 0 auto; }
      
      /* Each experiment is a separate block */
      .experiment-block {
        background: white;
        border: 2px solid #333;
        margin-bottom: 20px;
        padding: 15px;
      }

      .experiment-title {
        background: #333;
        color: white;
        padding: 5px 10px;
        font-weight: bold;
        margin: -15px -15px 15px -15px; /* Stretch to edges */
      }

      /* The grid for "Code -> Result" */
      .step {
        display: grid;
        grid-template-columns: 1fr 2fr; /* Left side code, right side result */
        gap: 10px;
        border-bottom: 1px dashed #ccc;
        padding: 10px 0;
      }
      .step:last-child { border-bottom: none; }

      .code-action { font-weight: bold; color: #000; }
      .result-success { color: green; }
      .result-error { color: red; background: #ffe6e6; padding: 2px; }
      .explanation { display: block; color: #666; font-size: 0.9em; margin-top: 4px; font-style: italic; }

    </style>
  </head>
  <body>

    <div class="container">
      <h1>JavaScript Cause & Effect</h1>
      <div id="output"></div>
    </div>

    <script>
      const outputDiv = document.getElementById('output');

      // Helper function to create the visual blocks
      function createExperiment(title) {
        const div = document.createElement('div');
        div.className = 'experiment-block';
        div.innerHTML = `<div class="experiment-title">${title}</div>`;
        outputDiv.appendChild(div);
        return div;
      }

      function logStep(container, codeText, resultText, isError, explanation) {
        const step = document.createElement('div');
        step.className = 'step';
        
        const resultClass = isError ? 'result-error' : 'result-success';
        
        step.innerHTML = `
          <div class="code-action">You ran:<br>${codeText}</div>
          <div class="${resultClass}">
            <strong>Happened:</strong> ${resultText}
            <span class="explanation"><br>👉 ${explanation}</span>
          </div>
        `;
        container.appendChild(step);
      }

      // ==========================================
      // EXPERIMENT 1: Block Scope (Var vs Let)
      // ==========================================
      const exp1 = createExperiment("1. Block Scope (The 'Leak' Test)");

      // Note: I changed this from a function to an 'if' block so 'var' actually leaks!
      // In JS, var is trapped by functions but ignores blocks like if/for.
      if (true) {
        var no = 2; 
        let no2 = 3; 
      }

      // Try to access 'var'
      try {
        logStep(exp1, 'console.log(no)', no, false, "The variable 'no' (var) leaked out of the block, so we can see it.");
      } catch (e) {
        logStep(exp1, 'console.log(no)', e.message, true, "Error.");
      }

      // Try to access 'let'
      try {
        console.log(no2);
      } catch (e) {
        logStep(exp1, 'console.log(no2)', e.message, true, "ReferenceError! 'let' stays inside the block. It does not exist here.");
      }


      // ==========================================
      // EXPERIMENT 2: Mutability (Let vs Const)
      // ==========================================
      const exp2 = createExperiment("2. Mutability (Let vs Const)");

      let str = "this can be changed ";
      
      // Update let
      str = "the new value for the str";
      logStep(exp2, 'str = "new value"', str, false, "Success! You declared 'str' with 'let', so you can change it.");

      const str2 = "have fun while changing this";
      
      // Try to update const
      try {
        str2 = "this is why you get the error";
        // Added this success log in case you change const to let in the future
        logStep(exp2, 'str2 = "new value"', str2, false, "Success! Variable updated.");
      } catch (e) {
        logStep(exp2, 'str2 = "new value"', e.message, true, "CRASH! You declared 'str2' with 'const', so it is read-only.");
      }


      // ==========================================
      // EXPERIMENT 3: The Object Loophole
      // ==========================================
      const exp3 = createExperiment("3. The Object Loophole");

      const myobj = {name: "alex"};
      
      // Modifying object property
      myobj.name = "sam"; 
      
      logStep(exp3, 'myobj.name = "sam"', JSON.stringify(myobj), false, "Wait, it worked? Yes! 'Const' protects the variable name, not the contents inside the object.");


      // ==========================================
      // EXPERIMENT 4: Global vs Local
      // ==========================================
      const exp4 = createExperiment("4. Global vs Local Scope");

      let msg = "Global Value";

      function scopeExperiment() {
        let msg = "Local Value";
        return msg;
      }

      const resultInside = scopeExperiment();
      logStep(exp4, 'Inside Function', resultInside, false, "The function created its own 'msg' variable. It doesn't touch the global one.");

      logStep(exp4, 'Outside Function', msg, false, "The global 'msg' variable remains unchanged.");

    </script>
  </body>
</html>
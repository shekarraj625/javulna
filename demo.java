const { exec } = require('child_process');
function deleteFile(fileName) {
// Vulnerable: directly using user input in shell command
exec("rm -rf " + fileName, (err) => {
if (err) console.error(err);
});
}

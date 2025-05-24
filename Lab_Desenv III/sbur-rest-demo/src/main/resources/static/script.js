
function searchTeam() {
    const teamName = document.getElementById("teamInput").value;
    fetch(`http://localhost:8080/teams/${teamName}`)
        .then(response => {
            if (!response.ok) throw new Error("Time não encontrado");
            return response.text();
        })
        .then(name => {
            const imagePath = `images/${name.toLowerCase().replace(/\s/g, '-')}.jpg`;
            document.getElementById("teamImage").src = imagePath;
            document.getElementById("teamImage").style.display = "block";
            document.getElementById("errorMessage").textContent = "";
        })
        .catch(err => {
            document.getElementById("teamImage").style.display = "none";
            document.getElementById("errorMessage").textContent = err.message;
        });
}

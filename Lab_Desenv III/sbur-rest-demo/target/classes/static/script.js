function searchTeam() {
    const teamName = document.getElementById("teamInput").value.trim();
    fetch(`http://localhost:8080/teams/${teamName}`)
        .then(response => {
            if (!response.ok) throw new Error("Time não encontrado");
            return response.text();
        })
        .then(name => {
            const imagePath = `images/${name.toLowerCase().replace(/\s/g, '-')}.jpg`;
            document.getElementById("teamImage").src = imagePath;
            document.getElementById("teamImage").style.display = "block";
            showMessage("", "success");
        })
        .catch(err => {
            document.getElementById("teamImage").style.display = "none";
            showMessage(err.message, "error");
        });
}

function addTeam() {
    const newTeam = document.getElementById("newTeamInput").value.trim();
    fetch("http://localhost:8080/teams", {
        method: "POST",
        headers: { "Content-Type": "text/plain" },
        body: newTeam
    })
    .then(response => response.text().then(text => ({ ok: response.ok, text })))
    .then(({ ok, text }) => {
        if (!ok) throw new Error(text);
        showMessage(text, "success");
    })
    .catch(err => showMessage(err.message, "error"));
}

function updateTeam() {
    const oldName = document.getElementById("oldTeamInput").value.trim();
    const newName = document.getElementById("updatedTeamInput").value.trim();
    fetch(`http://localhost:8080/teams/${oldName}`, {
        method: "PUT",
        headers: { "Content-Type": "text/plain" },
        body: newName
    })
    .then(response => response.text().then(text => ({ ok: response.ok, text })))
    .then(({ ok, text }) => {
        if (!ok) throw new Error(text);
        showMessage(text, "success");
    })
    .catch(err => showMessage(err.message, "error"));
}

function deleteTeam() {
    const teamName = document.getElementById("deleteTeamInput").value.trim();
    fetch(`http://localhost:8080/teams/${teamName}`, {
        method: "DELETE"
    })
    .then(response => response.text().then(text => ({ ok: response.ok, text })))
    .then(({ ok, text }) => {
        if (!ok) throw new Error(text);
        showMessage(text, "success");
    })
    .catch(err => showMessage(err.message, "error"));
}

function showMessage(message, type) {
    const errorEl = document.getElementById("errorMessage");
    const successEl = document.getElementById("successMessage");

    if (type === "error") {
        errorEl.textContent = message;
        successEl.textContent = "";
    } else {
        successEl.textContent = message;
        errorEl.textContent = "";
    }
}

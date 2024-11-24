const API_URL = "http://localhost:8080"; // URL correta para a API

// Registrar ponto
async function registrarPonto(horaEntrada, horaSaida) {
    try {
        const response = await fetch(`${API_URL}/pontos`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                horaEntrada: horaEntrada,
                horaSaida: horaSaida
            })
        });

        if (response.ok) {
            alert("Ponto registrado com sucesso!");
        } else {
            alert("Erro ao registrar ponto");
        }
    } catch (error) {
        console.error("Erro na requisição:", error);
    }
}

// Obter relatório de ponto
async function obterRelatorioPonto() {
    try {
        const response = await fetch(`${API_URL}/pontos`, {
            method: 'GET'
        });

        if (response.ok) {
            const pontos = await response.json();
            const tabela = document.querySelector("table tbody");

            pontos.forEach(ponto => {
                const linha = document.createElement("tr");
                linha.innerHTML = `
                    <td>${ponto.funcionario}</td>
                    <td>${ponto.entrada}</td>
                    <td>${ponto.saida}</td>
                    <td>${ponto.totalHoras}</td>
                `;
                tabela.appendChild(linha);
            });
        } else {
            alert("Erro ao carregar relatório de ponto");
        }
    } catch (error) {
        console.error("Erro na requisição:", error);
    }
}

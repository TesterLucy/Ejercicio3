// Generar lista de números aleatorios
let lista = Array.from({ length: 1000 }, () => Math.floor(Math.random() * 6901) + 100);

// Medir tiempo de ejecución para ordenamiento (usando el algoritmo de ordenamiento por inserción)
let inicio = performance.now();
lista.sort((a, b) => a - b);
let fin = performance.now();

let tiempo_ejecucion = fin - inicio;
console.log("Tiempo de ejecución en milisegundos:", tiempo_ejecucion);
/*
// Función para verificar si una lista está ordenada
function estaOrdenada(lista) {
    for (let i = 0; i < lista.length - 1; ++i) {
        if (lista[i] > lista[i + 1]) {
            return false;
        }
    }
    return true;
}

// Implementación de Bogosort
function bogosort(lista) {
    while (!estaOrdenada(lista)) {
        lista.sort(() => Math.random() - 0.5);
    }
}

// Generar lista de números aleatorios
let lista = Array.from({ length: 1000 }, () => Math.floor(Math.random() * 6901) + 100);

// Medir tiempo de ejecución para Bogosort
let inicioBogo = performance.now();
bogosort(lista);
let finBogo = performance.now();
let tiempoEjecucionBogo = finBogo - inicioBogo;
console.log("Tiempo de ejecución de Bogosort en milisegundos:", tiempoEjecucionBogo);

// Medir tiempo de ejecución para el segundo algoritmo de ordenamiento (usando el algoritmo de ordenamiento por inserción)
let inicioSegundo = performance.now();
lista.sort((a, b) => a - b);
let finSegundo = performance.now();
let tiempoEjecucionSegundo = finSegundo - inicioSegundo;
console.log("Tiempo de ejecución del segundo algoritmo en milisegundos:", tiempoEjecucionSegundo);

 */
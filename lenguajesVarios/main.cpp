#include <iostream>
#include <vector>
#include <algorithm>
#include <chrono>

int main() {
    std::vector<int> lista;

    // Generar lista de números aleatorios
    for (int i = 0; i < 1000; ++i) {
        lista.push_back(rand() % 6901 + 100);
    }

    // Medir tiempo de ejecución para ordenamiento (usando el algoritmo de ordenamiento por inserción)
    auto inicio = std::chrono::high_resolution_clock::now();
    std::sort(lista.begin(), lista.end());
    auto fin = std::chrono::high_resolution_clock::now();

    std::chrono::duration<double, std::milli> tiempo_ejecucion = fin - inicio;
    std::cout << "Tiempo de ejecución en milisegundos: " << tiempo_ejecucion.count() << std::endl;

    return 0;
}
/*
#include <iostream>
#include <vector>
#include <algorithm>
#include <chrono>

int main() {
    std::vector<int> lista;

    // Generar lista de números aleatorios
    for (int i = 0; i < 1000; ++i) {
        lista.push_back(rand() % 6901 + 100);
    }

    // Medir tiempo de ejecución para ordenamiento (usando el algoritmo de ordenamiento por inserción)
    auto inicio = std::chrono::high_resolution_clock::now();
    std::sort(lista.begin(), lista.end());
    auto fin = std::chrono::high_resolution_clock::now();

    std::chrono::duration<double, std::milli> tiempo_ejecucion = fin - inicio;
    std::cout << "Tiempo de ejecución en milisegundos: " << tiempo_ejecucion.count() << std::endl;

    return 0;
}
*/
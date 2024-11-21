-- Створення таблиці маршрутів
CREATE TABLE IF NOT EXISTS Routes (
    id BIGSERIAL PRIMARY KEY,
    route_number VARCHAR(10) NOT NULL,
    start_point VARCHAR(100) NOT NULL,
    end_point VARCHAR(100) NOT NULL,
    interval INT,
    schedule_type VARCHAR(50) CHECK (schedule_type IN ('інтервальний', 'фіксований')),
    descriptions TEXT
);

-- Створення таблиці транспортних засобів
CREATE TABLE IF NOT EXISTS Vehicles (
    id BIGSERIAL PRIMARY KEY,
    vehicle_type VARCHAR(50) CHECK (vehicle_type IN ('автобус', 'тролейбус', 'трамвай')) NOT NULL,
    capacity INT NOT NULL CHECK (capacity > 0),
    statuse VARCHAR(50) CHECK (statuse IN ('на маршруті', 'в ремонті')) NOT NULL
);

-- Створення таблиці призначень (Assignments)
CREATE TABLE IF NOT EXISTS Assignments (
    id BIGSERIAL PRIMARY KEY,
    route_id BIGINT REFERENCES Routes(id) ON DELETE CASCADE,
    vehicle_id BIGINT REFERENCES Vehicles(id) ON DELETE CASCADE,
    start_dates TIMESTAMP NOT NULL,
    end_date TIMESTAMP
);

-- Створення таблиці розкладів (Schedules)
CREATE TABLE IF NOT EXISTS Schedules (
    id BIGSERIAL PRIMARY KEY,
    route_id BIGINT REFERENCES Routes(id) ON DELETE CASCADE,
    departure_time TIME NOT NULL,
    arrival_time TIME NOT NULL
);

-- Створення таблиці зупинок (Stops)
CREATE TABLE IF NOT EXISTS Stops (
    id BIGSERIAL PRIMARY KEY,
    names VARCHAR(100) NOT NULL
);

-- Створення таблиці маршрутних зупинок (Route_Stops)
CREATE TABLE IF NOT EXISTS Route_Stops (
    id BIGSERIAL PRIMARY KEY,
    route_id BIGINT REFERENCES Routes(id) ON DELETE CASCADE,
    stop_id BIGINT REFERENCES Stops(id) ON DELETE CASCADE,
    stop_order INT NOT NULL
);

-- Додавання індексу для швидкого пошуку зупинок за порядком на маршруті
CREATE INDEX IF NOT EXISTS idx_route_stop_order ON Route_Stops(route_id, stop_order);
CREATE INDEX IF NOT EXISTS idx_assignments_route_id ON Assignments(route_id);
CREATE INDEX IF NOT EXISTS idx_assignments_vehicle_id ON Assignments(vehicle_id);
CREATE INDEX IF NOT EXISTS idx_schedules_route_id ON Schedules(route_id);
CREATE INDEX IF NOT EXISTS idx_route_stops_stop_id ON Route_Stops(stop_id);
CREATE INDEX IF NOT EXISTS idx_route_stops_stop_order ON Route_Stops(route_id, stop_order);
CREATE UNIQUE INDEX IF NOT EXISTS idx_routes_route_number ON Routes(route_number);
CREATE INDEX IF NOT EXISTS idx_stops_names ON Stops(names);
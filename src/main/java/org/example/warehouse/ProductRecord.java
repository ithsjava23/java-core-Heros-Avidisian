package org.example.warehouse;

import java.util.UUID;

public record ProductRecord(UUID id, String name, String category, double price) {


}

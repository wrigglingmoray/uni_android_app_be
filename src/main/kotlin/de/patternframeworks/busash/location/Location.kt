package de.patternframeworks.busash.location

import jakarta.persistence.*

@Entity
@Table(name = "locations")
data class Location (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "location_id") val location_id: Long,
    @Column(name = "latitude") val latitude: Double,
    @Column(name = "longitude") val longitude: Double
)
# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Message and service definitions for mqtt_client"
AUTHOR = "Lennart Reiher <lennart.reiher@rwth-aachen.de>"
ROS_AUTHOR = "Lennart Reiher <lennart.reiher@rwth-aachen.de>"
HOMEPAGE = "http://wiki.ros.org/mqtt_client"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "mqtt_client"
ROS_BPN = "mqtt_client_interfaces"

ROS_BUILD_DEPENDS = " \
    ros-environment \
    rosidl-default-generators \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ros-environment \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ros-environment \
    rosidl-default-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/mqtt_client-release/archive/release/jazzy/mqtt_client_interfaces/2.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/mqtt_client_interfaces"
SRC_URI = "git://github.com/ros2-gbp/mqtt_client-release;${ROS_BRANCH};protocol=https"
SRCREV = "302a6512755d23b2a4800969748d26cda4631027"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "Generate the message type support for dynamic message construction in C++."
AUTHOR = "Anthony Welte <tony.welte@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidlcpp"
ROS_BPN = "rosidlcpp_typesupport_introspection_cpp"

ROS_BUILD_DEPENDS = " \
    fmt \
    nlohmann-json \
    rosidl-runtime-cpp \
    rosidl-typesupport-introspection-c \
    rosidlcpp-generator-core \
    rosidlcpp-parser \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-core-native \
"

ROS_EXPORT_DEPENDS = " \
    fmt \
    nlohmann-json \
    rosidl-cmake \
    rosidl-runtime-c \
    rosidl-runtime-cpp \
    rosidlcpp-generator-core \
    rosidlcpp-parser \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    rosidl-generator-c-native \
    rosidl-generator-cpp-native \
    rosidl-pycommon-native \
"

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    fmt \
    nlohmann-json \
    rosidl-cli \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-parser \
    rosidl-pycommon \
    rosidl-typesupport-interface \
    rosidl-typesupport-introspection-c \
    rosidlcpp-generator-core \
    rosidlcpp-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidlcpp-release/archive/release/rolling/rosidlcpp_typesupport_introspection_cpp/0.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rosidlcpp_typesupport_introspection_cpp"
SRC_URI = "git://github.com/ros2-gbp/rosidlcpp-release;${ROS_BRANCH};protocol=https"
SRCREV = "9beec3006607e3d3fc1f35d5c8cfde7458c12bee"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

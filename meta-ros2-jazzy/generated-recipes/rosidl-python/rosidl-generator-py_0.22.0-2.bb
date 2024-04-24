# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Generate the ROS interfaces in Python."
AUTHOR = "Dharini Dutia <dharini@openrobotics.org>"
ROS_AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl_python"
ROS_BPN = "rosidl_generator_py"

ROS_BUILD_DEPENDS = " \
    rosidl-runtime-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    ament-index-python-native \
    python-cmake-module-native \
    rosidl-generator-c-native \
    rosidl-pycommon-native \
    rosidl-typesupport-c-native \
    rosidl-typesupport-interface-native \
"

ROS_EXEC_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-index-python \
    python3-numpy \
    rosidl-cli \
    rosidl-generator-c \
    rosidl-parser \
    rosidl-runtime-c \
    rpyutils \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-index-python \
    ament-lint-auto \
    ament-lint-common \
    python-cmake-module \
    python3-numpy \
    python3-pytest \
    rmw \
    rosidl-cmake \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-parser \
    rosidl-typesupport-c \
    rosidl-typesupport-fastrtps-c \
    rosidl-typesupport-introspection-c \
    rpyutils \
    test-interface-files \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl_python-release/archive/release/jazzy/rosidl_generator_py/0.22.0-2.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/rosidl_generator_py"
SRC_URI = "git://github.com/ros2-gbp/rosidl_python-release;${ROS_BRANCH};protocol=https"
SRCREV = "8220427f3d3a26be945adc0a3291127a9b4a8f82"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

package tests.javafuzzer1590;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 23:24:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-17L;
    public static double dFld=-72.80632;
    public static int iFld=-60285;
    public static volatile boolean bFld=true;
    public float fFld=67.953F;
    public byte byFld=45;
    public static int iFld1=131;
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -2.850F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i6, long l1) {

        long l2=38L, lArr[]=new long[N];
        float f1=79.237F;
        short s=-15229;
        int i7=-121, i8=-14, i9=-8;
        boolean b=true;

        FuzzerUtils.init(lArr, 281678029L);

        i6 += (int)Test.instanceCount;
        l2 = 1;
        while (++l2 < 136) {
            f1 = l1;
            l1 = s;
            for (i7 = 1; 12 > i7; ++i7) {
                l1 = i7;
                i9 = 1;
                do {
                    i8 <<= (int)53508L;
                    l1 *= l1;
                    i8 += (int)f1;
                    f1 -= -22;
                    lArr[(int)(l2)] = (long)f1;
                    i8 += i9;
                    if (b) break;
                } while (++i9 < 2);
                i8 += i7;
            }
        }
        vMeth1_check_sum += i6 + l1 + l2 + Float.floatToIntBits(f1) + s + i7 + i8 + i9 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(lArr);
    }

    public static int iMeth(int i4, int i5) {

        long l3=4011893812971153365L, lArr1[]=new long[N];
        int i10=-4, i11=10, i12=-14, iArr1[]=new int[N];

        FuzzerUtils.init(lArr1, 143L);
        FuzzerUtils.init(iArr1, -56140);

        for (float f : Test.fArrFld) {
            vMeth1(3, -3L);
            i4 *= (int)Test.dFld;
            Test.instanceCount += 14;
            switch ((((i4 >>> 1) % 1) * 5) + 3) {
            case 5:
                for (l3 = 1; l3 < 4; l3++) {
                    for (i11 = (int)(l3); i11 < 2; i11++) {
                        i4 *= (int)1.593F;
                        switch ((int)(((l3 % 9) * 5) + 79)) {
                        case 80:
                            i10 = Test.iFld;
                            lArr1 = FuzzerUtils.long1array(N, (long)-58989L);
                            break;
                        case 90:
                            iArr1[i11] -= i10;
                            break;
                        case 105:
                            Test.instanceCount += (i11 * i11);
                            iArr1[i11 + 1] = (int)l3;
                            break;
                        case 88:
                            i12 -= i4;
                            break;
                        case 106:
                            iArr1[i11] *= i4;
                            break;
                        case 86:
                            i12 -= (int)Test.dFld;
                            break;
                        case 103:
                            i10 += (i11 * i11);
                            break;
                        case 119:
                            i12 += (i11 ^ i4);
                        case 121:
                            f += 12;
                            break;
                        default:
                            i10 = (int)1.122440;
                        }
                    }
                }
                break;
            }
        }
        long meth_res = i4 + i5 + l3 + i10 + i11 + i12 + FuzzerUtils.checkSum(lArr1) + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i, int i1, long l) {

        int i2=-43, i3=-1, i13=-134, i14=-65376, i15=10, i16=-244, iArr[]=new int[N];
        boolean b1=true;
        long lArr2[]=new long[N];

        FuzzerUtils.init(iArr, -120);
        FuzzerUtils.init(lArr2, 6770355201329401352L);

        for (i2 = 361; i2 > 17; i2 -= 3) {
            try {
                i = (iArr[i2 - 1] / -582957103);
                iArr[i2 - 1] = (i3 / 1615308825);
                i = (iArr[i2 - 1] / 29);
            } catch (ArithmeticException a_e) {}
            i1 -= (iMeth(i1, 4) - i2);
            iArr[i2] = i2;
            iArr[(i >>> 1) % N] -= i2;
            for (i13 = 1; 14 > i13; i13++) {
                lArr2[i13 + 1] |= i;
                i3 *= i2;
                if (b1) {
                    Test.iFld = i13;
                    for (i15 = 1; i15 < 2; i15 += 2) {
                        i14 -= (int)Test.instanceCount;
                        lArr2 = lArr2;
                        if (b1) continue;
                        iArr[i2] += i13;
                    }
                } else {
                    i14 += (int)l;
                }
            }
        }
        vMeth_check_sum += i + i1 + l + i2 + i3 + i13 + i14 + i15 + i16 + (b1 ? 1 : 0) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        int i17=56850, i18=2854, i19=129, i20=47096, i21=-47, i22=-4, i23=-171, iArr2[]=new int[N];
        long l4=77L;
        short s1=-19174;

        FuzzerUtils.init(iArr2, -137);

        vMeth(Test.iFld, Test.iFld, Test.instanceCount);
        Test.instanceCount += Test.iFld;
        for (i17 = 2; 134 > i17; ++i17) {
            Test.instanceCount = -44584;
            Test.instanceCount += (i17 * i17);
            Test.instanceCount = Test.instanceCount;
        }
        Test.iFld = -42;
        i18 = i17;
        Test.iFld *= Test.iFld;
        i18 >>= (int)Test.instanceCount;
        for (i19 = 9; i19 < 176; i19++) {
            for (l4 = 5; l4 < 150; l4 += 2) {
                for (i22 = 1; i22 < 3; ++i22) {
                    i21 += (i22 | i20);
                    i20 -= i20;
                    if (Test.bFld) break;
                    i23 *= (int)l4;
                    i21 >>= i23;
                    switch (((i19 % 7) * 5) + 29) {
                    case 58:
                        i20 = i17;
                        i18 += i22;
                        fFld += i18;
                        iArr2[i19 + 1] = (int)1654L;
                    case 47:
                        i20 += (((i22 * i17) + fFld) - Test.iFld);
                        if (Test.bFld) continue;
                        i20 = byFld;
                    case 51:
                        Test.dFld /= (Test.iFld | 1);
                        Test.bFld = Test.bFld;
                        break;
                    case 62:
                        iArr2[(58160 >>> 1) % N] += Test.iFld1;
                        s1 = (short)79;
                    case 45:
                        i21 = (int)fFld;
                        break;
                    case 54:
                        if (true) continue;
                        break;
                    case 64:
                        iArr2[i22 - 1] >>= i22;
                        break;
                    }
                }
            }
        }


    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}

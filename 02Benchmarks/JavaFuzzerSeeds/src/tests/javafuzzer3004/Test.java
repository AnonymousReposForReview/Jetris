package tests.javafuzzer3004;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 00:44:03 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-1743884564L;
    public static double dFld=23.116050;
    public int iFld=-9;
    public short sFld=-11708;
    public int iArrFld[]=new int[N];
    public boolean bArrFld[]=new boolean[N];

    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public void vMeth1(int i6) {

        int i7=-225, i8=-6, i9=-15592, i10=29;
        boolean b=true;
        float f=0.669F;
        short s=17750;

        Test.dFld -= i6;
        if (false) {
            iArrFld[(i6 >>> 1) % N] <<= i6;
            i6 -= i6;
            for (i7 = 18; i7 < 306; i7++) {
                i8 = -57366;
                if (b) break;
                i8 %= (int)((long)(Test.dFld) | 1);
                for (i9 = i7; i9 < 6; ++i9) {
                    Test.instanceCount += (i9 * i9);
                    Test.instanceCount = i6;
                    i6 = i7;
                    i8 *= (int)Test.instanceCount;
                    f += -242L;
                    i10 += i6;
                }
            }
        } else if (b) {
            Test.instanceCount += s;
            vMeth1_check_sum += i6 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + Float.floatToIntBits(f) + s;
            return;
        } else {
            i8 = i9;
            vMeth1_check_sum += i6 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + Float.floatToIntBits(f) + s;
            return;
        }
        vMeth1_check_sum += i6 + i7 + i8 + (b ? 1 : 0) + i9 + i10 + Float.floatToIntBits(f) + s;
    }

    public void vMeth(int i5) {

        byte by=-102;
        int i11=-6, i12=5, i13=-8, i14=6946, i15=-50055;
        boolean b1=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, false);

        vMeth1(i5);
        by &= (byte)Test.instanceCount;
        i11 = 1;
        while (++i11 < 313) {
            bArr[i11 + 1] = b1;
            switch (((i5 >>> 1) % 4) + 72) {
            case 72:
                for (i12 = 1; i12 < 5; i12++) {
                    i13 = i11;
                    Test.instanceCount += (-7 + (i12 * i12));
                    Test.dFld -= i12;
                    i14 = 1;
                    while (++i14 < 2) {
                        i5 &= i15;
                        Test.dFld *= i14;
                        i13 = i13;
                        iArrFld = iArrFld;
                        Test.instanceCount -= Test.instanceCount;
                    }
                }
            case 73:
                i15 += i13;
                break;
            case 74:
                if (i14 != 0) {
                    vMeth_check_sum += i5 + by + i11 + (b1 ? 1 : 0) + i12 + i13 + i14 + i15 +
                        FuzzerUtils.checkSum(bArr);
                    return;
                }
                break;
            case 75:
                if (b1) break;
                break;
            }
        }
        vMeth_check_sum += i5 + by + i11 + (b1 ? 1 : 0) + i12 + i13 + i14 + i15 + FuzzerUtils.checkSum(bArr);
    }

    public float fMeth(int i3, int i4) {

        int i16=5573, i17=-6, i18=44454, i19=53144, i20=55250, i21=77;
        float f1=19.833F;
        boolean b2=false;

        vMeth(i16);
        i17 = 1;
        do {
            i3 += (int)(-63.771F + (i17 * i17));
            for (i18 = 1; i18 < 4; i18++) {
                switch (((i18 % 9) * 5) + 17) {
                case 46:
                    i16 += (((i18 * f1) + i20) - i17);
                    Test.instanceCount = i18;
                    i21 = 1;
                    do {
                        if (b2) continue;
                        i16 >>= i18;
                        iFld -= i4;
                        i4 = 1;
                        Test.instanceCount += i16;
                        Test.instanceCount = sFld;
                    } while (++i21 < 2);
                    break;
                case 53:
                    Test.instanceCount += (i18 | Test.instanceCount);
                    break;
                case 38:
                    f1 += sFld;
                    break;
                case 51:
                    Test.instanceCount = sFld;
                    break;
                case 32:
                    Test.instanceCount *= i20;
                case 50:
                    Test.instanceCount = 13697;
                    break;
                case 30:
                    iArrFld[(-244 >>> 1) % N] += (int)Test.instanceCount;
                    break;
                case 54:
                    i20 += i3;
                    break;
                case 29:
                    i4 /= (int)(Test.instanceCount | 1);
                    break;
                default:
                    i3 = (int)Test.instanceCount;
                }
            }
        } while (++i17 < 379);
        long meth_res = i3 + i4 + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1) + i20 + i21 + (b2 ? 1 : 0);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-18256, i1=-44513, i2=-10, i22=131;
        double d=-53.46825;
        byte by1=-64;
        boolean b3=false;
        float f2=2.334F, fArr[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(fArr, -2.253F);
        FuzzerUtils.init(sArr, (short)-32634);

        i = 1;
        while (++i < 123) {
            i1 *= i1;
            Test.instanceCount = i;
            i1 += Short.reverseBytes((short)((i1--) * (--d)));
            i2 = 1;
            while (++i2 < 204) {
                i1 = (int)(i1 -= (int)(fMeth(7, -35363) * i1));
                Test.instanceCount += (i2 + i1);
                i22 = 1;
                while (++i22 < 1) {
                    i1 = i1;
                    fArr[i22 - 1] = Test.instanceCount;
                    switch ((i2 % 5) + 2) {
                    case 2:
                        iFld = (int)Test.instanceCount;
                        break;
                    case 3:
                        sArr[i2] = (short)-26051;
                        iArrFld[(i22 >>> 1) % N] *= by1;
                        by1 <<= (byte)sFld;
                        bArrFld[i] = b3;
                        break;
                    case 4:
                        f2 *= i1;
                        iFld <<= i;
                        iFld += (i22 * i22);
                        break;
                    case 5:
                    case 6:
                        Test.instanceCount = Test.instanceCount;
                        iFld = i1;
                        i1 = i22;
                        switch (((i % 2) * 5) + 1) {
                        case 9:
                            by1 >>= (byte)i2;
                            iArrFld[(i22 >>> 1) % N] = (int)Test.instanceCount;
                            Test.instanceCount <<= by1;
                            break;
                        case 6:
                            iFld *= (int)f2;
                            Test.instanceCount += (((i22 * sFld) + Test.instanceCount) - i22);
                            iArrFld[i2] = 3;
                            d += f2;
                            break;
                        }
                        break;
                    default:
                        i1 -= (int)f2;
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
//DEBUG  fMeth ->  fMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth fMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
